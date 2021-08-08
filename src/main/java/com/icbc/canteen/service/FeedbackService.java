package com.icbc.canteen.service;

import com.icbc.canteen.dao.FeedbackDao;
import com.icbc.canteen.dao.LostDao;
import com.icbc.canteen.entity.Feedback;
import com.icbc.canteen.entity.Lost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackDao feedbackDao;

    public int insertLost(Feedback feedback) {
        return feedbackDao.insertFeedback(feedback);
    }

}
