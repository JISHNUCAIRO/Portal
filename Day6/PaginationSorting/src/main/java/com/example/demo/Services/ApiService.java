package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Models.Child;
import com.example.demo.Repositories.ChildRepo;

@Service
public class ApiService {
@Autowired
ChildRepo rep;

public Optional<Child> get(int id )
{
  return rep.findById(id);
}
public List<Child> setPage(@PathVariable int offset,@PathVariable int pageSize)
{
	Page<Child> page = rep.findAll(PageRequest.of(offset,pageSize));
      return page.getContent();	
}
public List<Child> setPageBabyId(int offset,int pageSize)
{
	Page<Child> pager = rep.findByBabyId(PageRequest.of(offset, pageSize));
    return pager.getContent();
}
public List<Child> setPageBabyFirstName(int offset,int pagesize){
	Page<Child> pager=rep.findByBabyFirstName(PageRequest.of(offset, pagesize));
	return pager.getContent();
}
public List<Child> setPageBabyLastName(int offset,int pageSize)
{ 
	Page<Child> p=rep.findByBabyLastName(PageRequest.of(offset, pageSize));
  return p.getContent();
}
public List<Child> setPageMotherName(int offset,int pageSize)
{ 
	Page<Child> p=rep.findByMotherName(PageRequest.of(offset, pageSize));
  return p.getContent();
}
public List<Child> setPageFatherName(int offset,int pageSize)
{ 
	Page<Child> p=rep.findByFatherName(PageRequest.of(offset, pageSize));
  return p.getContent();
}
public List<Child> setPageAddress(int offset,int pageSize)
{ 
	Page<Child> p=rep.findByAddress(PageRequest.of(offset, pageSize));
  return p.getContent();
}

}
