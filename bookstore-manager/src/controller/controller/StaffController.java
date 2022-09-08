package controller.controller;

import model.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffController {
    private String name;
    public static List<Staff> staffList = new ArrayList<>();
    public void addNewStaff(Staff Staff) {
        staffList.add(Staff);
    }
    public void editStaff(int index,Staff staff){
        staffList.set(index,staff);
    }

    public StaffController(String name, List<Staff> staffList) {
        this.name = name;
        this.staffList = staffList;
    }

    public StaffController(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
