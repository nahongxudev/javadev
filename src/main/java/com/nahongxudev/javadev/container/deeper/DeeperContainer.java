package com.nahongxudev.javadev.container.deeper;

import java.util.*;

/**
 * Created by nahongxu on 2016/6/14.
 * Collections.nCopies : all the copies are the same reference!
 */
public class DeeperContainer {

    public static void main(String[] args) {
        Address address=new Address("wudaokou");
        System.out.println("address:"+address);
        List<Address> addressList=new ArrayList<Address>(Collections.nCopies(4,address));
        System.out.println("addressList:"+addressList.toString());
        System.out.println("-------------");
        address.setAddress("shangdi");
        System.out.println("address:"+address);
        System.out.println("addressList:"+addressList.toString());
        System.out.println("-------------");
        Address temp=addressList.get(0);
        temp.setAddress("changping");
        System.out.println("address:"+address);
        System.out.println("addressList:"+addressList.toString());
    }
}

class Address{
    public String address;

    public Address(String address) {
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
        return super.toString()+" "+address;
    }
}