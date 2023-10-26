package com.tester;

import java.util.HashMap;
import java.util.Scanner;

import com.core.EmpType;
import com.core.Employee;
import com.utils.EmpUtils;
import com.validate.Validate;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Employee> empMap = EmpUtils.sampleDataOfEmployee();

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.println("1.ADD FULL TIME EMPLOYEE");
				System.out.println("2.ADD PART TIME EMPLOYEE");
				System.out.println("3.DELETE A EMPLOYEE BY EMPID");
				System.out.println("4.SEARCH EMPLOYEE BY ADDHAR NO");
				System.out.println("5.DISPLAY ALL EMPLOYEE DETAILS");
				System.out.println("6.DISPLAY ALL EMPLOYEE DETAILS SORTED BY JOINING DATE");
				System.err.println("0.EXIT");

				System.out.println("Enter choice");

				try {
					switch (sc.nextInt()) {

					case 1:

						System.out.println("Enter name,phoneNo,aadharNo,joinigDat");
						Employee e1 = Validate.ValidateAllInputs(sc.next(), sc.next(), EmpType.FTE, sc.next(),
								sc.next());
						// String name, String phoneNo, EmpType type, String aadhaarNo, LocalDate
						// joiningDate
						empMap.put(e1.getEmpId(), e1);
						System.out.println("Employee Added.!");

						break;

					case 2:
						System.out.println("Enter name,phoneNo,aadharNo,joinigDat");
						e1 = Validate.ValidateAllInputs(sc.next(), sc.next(), EmpType.PTE, sc.next(), sc.next());
						// String name, String phoneNo, EmpType type, String aadhaarNo, LocalDate
						// joiningDate
						empMap.put(e1.getEmpId(), e1);
						System.out.println("Employee Added.!");

						break;

					case 3:
						System.out.println("Enter the employee Id to be deleted");
						EmpUtils.deleteById(empMap, sc.nextInt());
						System.out.println("Employee Deleted.!");

						break;

					case 4:

						System.out.println("Enter the aadharNo:");
						EmpUtils.findAddharNo(sc.next(), empMap);

						break;

					case 5:

						empMap.values().stream().forEach(p -> System.out.println(p));

						break;

					case 6:

						empMap.values().stream().sorted((p1, p2) -> p1.getJoiningDate().compareTo(p2.getJoiningDate()))
								.forEach(p -> System.out.println(p));
						break;

					case 0:
						System.exit(0);

					default:
						System.out.println("Invalid Choice:");
						break;
					}

				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}

		} catch (Exception e) {

		}

	}

}
