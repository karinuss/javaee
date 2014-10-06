package ru.karinuss;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by karina on 03.10.14.
 */

//todo add annotations
@Entity
@Table(name="bc_table", schema = "public")
public class BusinessCenter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bc_id")
    private long businessCenterId;

    @OrderColumn
    @Column(name = "bc_address", nullable = true)
    private String address;

   // @OrderBy
    @OneToMany(mappedBy = "businessCenter", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    public List<VendingMachine> listMachines;

    public BusinessCenter() {
        this.listMachines = new ArrayList<VendingMachine>();
    }

    public List<VendingMachine> getListMachines() {
        return listMachines;
    }

    public void setListMachines(List<VendingMachine> listMachines) {
        this.listMachines = listMachines;
    }

    public long getBusinessCenterId() {
        return businessCenterId;
    }

    public BusinessCenter(String address) {
        this();
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "BusinessCenter[" + businessCenterId + "] at " + address;
    }
}
