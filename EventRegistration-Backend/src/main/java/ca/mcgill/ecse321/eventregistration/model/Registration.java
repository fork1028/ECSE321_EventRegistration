package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Registration{
private Integer id;
   
   public void setId(Integer value) {
this.id = value;
    }
@Id
public Integer getId() {
return this.id;
    }
private Person person;

@ManyToOne(optional=false)
public Person getperson() {
   return this.person;
}

public void setPerson(Person person) {
   this.person = person;
}

private Event event;

@ManyToOne(optional=false)
public Event getEvent() {
   return this.event;
}

public void setEvent(Event event) {
   this.event = event;
}

}
