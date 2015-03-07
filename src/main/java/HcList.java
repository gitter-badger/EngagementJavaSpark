import java.io.Serializable;
import java.util.ArrayList;

public class HcList implements Serializable {

	private static final long serialVersionUID = 4614441050244688113L;
	private Integer subject, x, y, z;

	private String id;
	private ArrayList<Integer> data;

	public HcList(Integer x, Integer y, Integer z, Integer subject,
			ArrayList<Integer> data) {
		this.subject = subject;
		this.x = x;
		this.y = y;
		this.z = z;
		this.data = data;
		this.id = x + "|" + y + "|" + z + "|" + subject;
	}

	public void setSubject(Integer subject) {
		this.subject = subject;
	}

	public String getID() {
		return this.id;
	}

	public Integer getSubject() {
		return this.subject;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getX() {
		return this.x;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getY() {
		return this.y;
	}

	public void setZ(Integer z) {
		this.z = z;
	}

	public Integer getZ() {
		return this.z;
	}

	public void setData(ArrayList<Integer> data) {
		this.data = data;
	}

	public ArrayList<Integer> getData() {
		return this.data;
	}

}