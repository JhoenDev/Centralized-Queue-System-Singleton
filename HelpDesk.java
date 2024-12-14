public class HelpDesk{
	private String deskName;
	private CentralQueueingSystem queue;

	public HelpDesk(String name, CentralQueueingSystem queue){
		this.deskName = name;
		this.queue = queue;
	}

	public String getName(){
		return deskName;
	}

	public int getQue(){
		return queue.getCurrentQue();
	}

	public void add(){
		queue.addQueNum();
	}

	public void reset(){
		queue.resetQue();
	}



}
