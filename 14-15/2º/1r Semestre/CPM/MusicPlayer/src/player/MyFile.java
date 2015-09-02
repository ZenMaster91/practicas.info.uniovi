package player;

import java.io.File;

public class MyFile {
	private File f;
	
	public MyFile(File f){
		this.f = f;
	}
	
	public File getFile(){
		return f;
	}
	
	
	public String toString(){
		
		return f.getName();
		
	}

}
