package gof.creation.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Target implements Serializable{

	private static final long serialVersionUID = -3578876362530518841L;

	public Object deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream os = new ObjectOutputStream(bo);
		os.writeObject(this);
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream is = new ObjectInputStream(bi);
		return is.readObject();
	}
}
