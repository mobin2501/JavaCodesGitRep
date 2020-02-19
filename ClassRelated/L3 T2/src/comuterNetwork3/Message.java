package comuterNetwork3;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Message implements Serializable {
	int header;
	String data;
	int protocolID;
	boolean tailor;
	Message(int header,String data,int pid,boolean tailor){
		this.header=header;
		this.data=data;
		this.protocolID=pid;
		this.tailor=tailor;
	}
	void ShowDet() {
		System.out.println("header:"+header);
	     System.out.println("data:"+data);
	     System.out.println("protocolID:"+protocolID);
	     System.out.println("tailor:"+tailor);
	}

}
