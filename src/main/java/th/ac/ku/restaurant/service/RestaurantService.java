package th.ac.ku.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.restaurant.model.Restaurant;
import th.ac.ku.restaurant.repository.RestaurantRepository;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> getAll() {
        return repository.findAll();
    }

    public Restaurant create(Restaurant restaurant) {
        repository.save(restaurant);
        return restaurant;
    }


    public Restaurant getRestaurant(int id) {
        return repository.findById(id).get();
    }

    public Restaurant update(int id, Restaurant requestBody) {
        Restaurant old = repository.findById(id).get();
        old.setName(requestBody.getName());
        old.setAddress(requestBody.getAddress());
        old.setPhone(requestBody.getPhone());
        old.setNumSeats(requestBody.getNumSeats());

        return repository.save(old);

    }

    public Restaurant delete(int id) {
        Restaurant record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }

}
