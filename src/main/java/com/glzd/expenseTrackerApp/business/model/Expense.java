package com.glzd.expenseTrackerApp.business.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "expense_seq_generator")
    @SequenceGenerator(name = "expense_seq_generator", sequenceName = "EXPENSE_SEQ", allocationSize = 1)
    private Long id;

    @NotEmpty(message = "Please specify the name of expense")
    private String name;

    @NotEmpty(message = "Please specify the name of expense")
    private String expenseType;

    @DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer=15, fraction=2)
    @NotNull(message = "Please specify an amount")
    private BigDecimal amount;

    @NotNull(message = "Date cannot be empty!")
    private LocalDate date;

    @CreationTimestamp
    private Timestamp creationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expense(Long id, @NotEmpty(message = "Please specify the name of expense") String name,
			@NotEmpty(message = "Please specify the name of expense") String expenseType,
			@DecimalMin(value = "0.0", inclusive = false) @Digits(integer = 15, fraction = 2) @NotNull(message = "Please specify an amount") BigDecimal amount,
			@NotNull(message = "Date cannot be empty!") LocalDate date, Timestamp creationDate) {
		super();
		this.id = id;
		this.name = name;
		this.expenseType = expenseType;
		this.amount = amount;
		this.date = date;
		this.creationDate = creationDate;
	}
    
    

}
