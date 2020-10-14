package com.rbac.repositories;

import com.rbac.models.Issue;

import java.util.List;

/**
 * @author kawasima
 * @author tada
 */
public interface IssueRepository {

    public List<Issue> findAll();

    public void register(Issue issue, String account);
}
