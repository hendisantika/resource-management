package com.hendisantika.resourcemanagement.domain;

import lombok.Data;

import javax.persistence.*;
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
