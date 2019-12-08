package com.kodilla.testing.forum.statistics;

import com.codilla.testing.forum.statistics.CalculateStatistics;
import com.codilla.testing.forum.statistics.Statistics;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
    //Given
    Statistics statisticsMock = mock(Statistics.class);
    int numberOfUsers = 0;
    int numberOfPosts = 1000;
    int numberOfComments = 0;
    int evenNrPostsPerUsers = numberOfPosts / numberOfUsers;
    int evenNrCommentsPerUsers = numberOfComments / numberOfUsers;
    int evenNrCommentsPerPosts = numberOfComments / numberOfPosts;

           CalculateStatistics calculateStatistics = new CalculateStatistics();


}
