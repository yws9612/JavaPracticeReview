import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rec implements Serializable{
	int x,y;
	//��ü�� ���Ͽ� ����: ����ȭ
	//���Ͽ� ������ ��ü�� �о��: ������ȭ
	Rec(int x, int y){
		this.x=x;this.y=y;
	}
	void show() {
		System.out.println(x+ " "+y);
	}
}

public class Serializableasdf {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream in=
				new ObjectInputStream(new FileInputStream("obj.dat"));
		
		Rec r1=(Rec)in.readObject();
		//object -> �ְ�����
		Rec r2=(Rec)in.readObject();
		String r3=(String)in.readObject();
		
		//��ü�� �̿��� ����Լ��� ����
		r1.show();
		r2.show();
		System.out.println(r3);
		
		in.close();
		
		
		 /* ObjectOutputStream os=null;
		  
		  os=new ObjectOutputStream(new FileOutputStream("obj.dat"));
		  
		  //Rec r=new Rec(4,7);
		  os.writeObject(new Rec(4,7));
		  os.writeObject(new Rec(8,5));
		  os.writeObject(new String("glgl"));
		  
		  os.close();*/

	}
}