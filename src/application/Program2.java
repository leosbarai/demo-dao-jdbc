package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n===== TEST 3: seller findByAll =====");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
    }
}