package controller.function;

import controller.display.DisplayStaff;
import controller.manager.StaffManager;

import controller.menu.StaffMenu;
import model.Staff;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class StaffFunction {
    public void searchStaffbyName(List<Staff> staffList){
        Iterator<Staff> iterator;
        String nameValue = InputValue.enterNameForm();
        iterator = staffList.iterator();
        while(iterator.hasNext()){
            Staff holder = iterator.next();
            if (Objects.equals(holder.getStaffName(), nameValue)) {
                DisplayStaff displayStaff = new DisplayStaff();
                StaffManager staffManager = new StaffManager(holder, displayStaff);
                staffManager.updateDisplayStaff();
            }
        }
    }
    public void searchStaffbyID(List<Staff> staffList) {
        Iterator<Staff> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = staffList.iterator();
        while(iterator.hasNext()){
            Staff holder = iterator.next();
            if (Objects.equals(holder.getID(), idValue)) {
                DisplayStaff displayStaff = new DisplayStaff();
                StaffManager staffManager = new StaffManager(holder, displayStaff);
                staffManager.updateDisplayStaff();
            }
        }
    }
    public void deleteStaffByName(List<Staff> staffList) {
        Iterator<Staff> iterator;
        String nameValue = InputValue.enterNameForm();
        iterator = staffList.iterator();
        while (iterator.hasNext()) {
            Staff holder = iterator.next();
            if (Objects.equals(holder.getStaffName(), nameValue)) {
                staffList.remove(holder);
                break;
            }
        }
    }
    public void editStaffByID(List<Staff> staffList) throws IOException {
        Iterator<Staff> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = staffList.iterator();
        while (iterator.hasNext()) {
            Staff holder = iterator.next();
            if (Objects.equals(holder.getID(), idValue)) {
                StaffMenu staffMenu = new StaffMenu();
                Staff newstaff =  staffMenu.createStaffForm();
                staffList.set(staffList.indexOf(holder), newstaff);
                break;
            }
        }
    }
}
