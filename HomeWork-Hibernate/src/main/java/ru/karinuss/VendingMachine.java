package ru.karinuss;

import javax.persistence.*;
import java.util.List;

/**
 * Created by karina on 03.10.14.
 */

//todo add annotations
@Entity
@Table(name="vm_table", schema = "public")
public class VendingMachine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vm_id", nullable = true)
    private long id;

    @Column(name="vm_type", nullable = false)
    private String vmType;

    public String getVmType() {
        return vmType;
    }

    public void setVmType(String vmType) {
        this.vmType = vmType;
    }

    public BusinessCenter getBusinessCenter() {

        return businessCenter;
    }

    public void setBusinessCenter(BusinessCenter businessCenter) {
        this.businessCenter = businessCenter;
    }

    @JoinColumn(name = "bc_id")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private BusinessCenter businessCenter;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public VendingMachine() {

    }

    public VendingMachine(String type) {
        this();
        this.vmType = type;
    }

    public String getType() {
        return vmType;
    }

    public void setType(String type) {
        this.vmType = type;
    }

    @Override
    public String toString() {
        return "VendingMachine with type='" + vmType + "'";
    }
}
