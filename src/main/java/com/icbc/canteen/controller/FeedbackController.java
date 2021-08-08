package com.icbc.canteen.controller;

import com.icbc.canteen.dao.FeedbackDao;
import com.icbc.canteen.entity.Feedback;
import com.icbc.canteen.entity.Lost;
import com.icbc.canteen.service.FeedbackService;
import com.icbc.canteen.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping(path = "/insertFeedback", method = RequestMethod.POST)
    @ResponseBody
    public int insertFeedback(Feedback feedback) {
        return feedbackService.insertLost(feedback);
    }

}
