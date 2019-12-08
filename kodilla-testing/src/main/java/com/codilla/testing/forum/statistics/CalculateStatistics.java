package com.codilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics{
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    int evenNrPostsPerUsers;
    int evenNrCommentsPerUsers;
    int evenNrCommentsPerPosts;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getEvenNrPostsPerUsers() {
        return evenNrPostsPerUsers;
    }

    public int getEvenNrCommentsPerUsers() {
        return evenNrCommentsPerUsers;
    }

    public int getEvenNrCommentsPerPosts() {
        return evenNrCommentsPerPosts;
    }

    public void calculateAdvStatistics(Statistics statistics){
       this.numberOfUsers = statistics.usersNames().size();
       this.numberOfPosts = statistics.postsCount();
       this.numberOfComments = statistics.commentsCount();
       this.evenNrPostsPerUsers = numberOfPosts / numberOfUsers;
       this.evenNrCommentsPerUsers = numberOfComments / numberOfUsers;
       this.evenNrCommentsPerPosts = numberOfComments / numberOfPosts;




    }
}
