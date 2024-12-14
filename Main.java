public class Main {

	public static void main(String[] args) {
		HelpDesk helpDesk1 = new HelpDesk("Desk 1", CentralQue.getInstance());
		HelpDesk helpDesk2 = new HelpDesk("Desk 2", CentralQue.getInstance());
		HelpDesk helpDesk3 = new HelpDesk("Desk 3", CentralQue.getInstance());
		helpDesk1.reset();
		helpDesk1.add();
		System.out.println(helpDesk1.getName() + " Number :" + helpDesk1.getQue());
		helpDesk2.add();
		System.out.println(helpDesk2.getName() + " Number :" + helpDesk1.getQue());
		helpDesk3.add();
		System.out.println(helpDesk3.getName() + " Number :" + helpDesk1.getQue());
		helpDesk2.reset();
		System.out.println(helpDesk3.getName() + " Number :" + helpDesk1.getQue());
		helpDesk4.add();
		System.out.println(helpDesk3.getName() + " Number :" + helpDesk1.getQue());

	}
}
