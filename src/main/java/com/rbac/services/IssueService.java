package com.rbac.services;



import com.rbac.models.Issue;

import java.util.List;

/**
 * @author tada
 */
public interface IssueService {

    public List<Issue> findAll();

    public void register(Issue issue, String account);

}
