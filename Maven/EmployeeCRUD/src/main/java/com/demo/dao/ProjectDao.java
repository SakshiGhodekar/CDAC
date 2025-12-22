package com.demo.dao;

import java.util.Set;

import com.demo.beans.Project;

public interface ProjectDao {

	boolean save(Project p);

	Set<Project> findById(String[] parr);

}
