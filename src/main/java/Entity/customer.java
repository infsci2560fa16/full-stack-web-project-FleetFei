/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
import java.util.*;
import javax.xml.crypto.Data;
/**
 *
 * @author fei
 */
public class customer {

	private int id;
	private String name;
	private String password;
        private String email;
        
        public customer(){
        }
        
	public customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
	
//	

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	
}
  

