package th.ac.ku.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String address;
    private String phone;
    private int numSeats;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setAddress(String address) {
        if (address != null) {
            this.address = address;
        }
    }

    public void setPhone(String phone) {
        if (phone != null) {
            this.phone = phone;
        }
    }

    public void setNumSeats(int numSeats) {
        if (numSeats >= 0) {
            this.numSeats = numSeats;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumSeats() {
        return numSeats;
    }
}
