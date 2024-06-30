package com.hendisantika.resourcemanagement.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-24
 * Time: 06:31
 */
@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date assignDate;

    @Temporal(TemporalType.DATE)
    private Date returnDate;

    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @Column
    private int status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Item_Id_Transcation")
    private Item itemTranscation;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Member_Id_Transcation")
    private Member memberTranscation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Room_Id_Transcation")
    private Room roomTanscation;

}
