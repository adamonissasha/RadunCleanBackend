package com.example.demo.Controllers;

import com.example.demo.Models.Review;
import com.example.demo.Services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @GetMapping("/reviews")
    public List<Review> getAllReviews () {
        return reviewService.getAllReviews();
    }

    @PostMapping("addReview")
    public String addReview(@RequestBody Review review){
        reviewService.addReview(review);
        return "Review successfully added";
    }

    @DeleteMapping("deleteReview/{id}")
    public String deleteReview(@PathVariable Long id){
       reviewService.deleteReviewById(id);
        return "Review successfully deleted";
    }
}
