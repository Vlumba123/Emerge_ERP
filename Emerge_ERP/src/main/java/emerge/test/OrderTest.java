package emerge.test;

import java.util.Iterator;
import java.util.List;

import emerge.bean.OrderBean;

import emerge.model.OrderModel;

public class OrderTest {

	public static void main(String[] args) throws Exception {

		// testAdd();
		testList();

	}

	private static void testList() throws Exception {

		OrderBean bean = new OrderBean();

		OrderModel ms = new OrderModel();

		List<OrderBean> list = ms.search();

		Iterator<OrderBean> it = list.iterator();

		System.out.println("\tCustomerName\tMobile\tCustomerAddress\tRequirements");

		while (it.hasNext()) {

			OrderBean bean1 = (OrderBean) it.next();

			System.out.print("\t " + bean1.getCustomerName());
			System.out.print("\t " + "    "+ bean1.getMobile());
			System.out.print("\t " + "    "  +   bean1.getCustomerAddress());
			System.out.print("\t " + "      " + bean1.getRequirement());

		}

	}

	

	private static void testAdd() {

		OrderBean bean = new OrderBean();

		bean.setCustomerName("vishu");
		bean.setMobile("9876543210");
		bean.setCustomerAddress("Indore");
		bean.setRequirement("i7 required");

		OrderModel Om = new OrderModel();

		try {
			Om.add(bean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Inserted");

	}

}
