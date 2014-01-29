public interface PersonQueue {
/**
* Adds another person to the queue.
*/
public void insert(PersonStack person);
/**
* Removes a person from the queue.
*/
public PersonStack retrieve();
}
