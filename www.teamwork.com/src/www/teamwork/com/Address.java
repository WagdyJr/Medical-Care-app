/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.teamwork.com;

/**
 *
 * @author q
 */
public class Address {
    private String Country;
    private String Region;
    private String Street;

    public Address() {
    }

    public Address(String Country, String Region, String Street) {
        this.Country = Country;
        this.Region = Region;
        this.Street = Street;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }
    
    
}
