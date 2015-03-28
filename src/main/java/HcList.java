import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HcList implements Serializable {

	private static final long serialVersionUID = 4614441050244688113L;
	private Integer x, y, z;

	private String id;
	private List<Integer> data;

	public HcList(String id,Integer x, Integer y, Integer z, List<Integer> data) {
		// this.subject = subject;
		this.x = x;
		this.y = y;
		this.z = z;
		this.data = data;
		this.id = id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
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

	public List<Integer> getData() {
		return this.data;
	}

}