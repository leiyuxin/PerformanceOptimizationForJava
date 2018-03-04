package leiyuxin.performance.bd;

import leiyuxin.performance.vo.Order;

public class BusinessDelegateClient {
	public static void main(String[] argv) throws Exception {
		BusinessDelegate bd = new BusinessDelegate();
		Order o = bd.getOrder(11);
		o.setNumber(11);
		bd.updateOrder(o);
	}
}
