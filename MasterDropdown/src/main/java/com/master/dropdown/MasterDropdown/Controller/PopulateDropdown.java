package com.master.dropdown.MasterDropdown.Controller;


import com.master.dropdown.MasterDropdown.Dto.DropdownResponse;
import com.master.dropdown.MasterDropdown.Repository.CommonRepository;
import com.master.dropdown.MasterDropdown.Service.PopulateDropdownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("dropdown")
public class PopulateDropdown {

    @Autowired
    private CommonRepository repo;

    @GetMapping("getGender")
    public List<DropdownResponse> getGender(@RequestParam Integer langCd){
        return repo.getGenderList(langCd);
    }

    @GetMapping("eduQualification")
    public List<DropdownResponse> getEducationQualification(@RequestParam Integer langCd){
        return repo.getEducationQualificationList(langCd);
    }

    @GetMapping("maritalStatus")
    public List<DropdownResponse> getMaritalStatus(@RequestParam Integer langCd){
        return repo.getMaritalStatus(langCd);
    }

    @GetMapping("physicalFeature")
    public List<DropdownResponse> getPhysicalFeature(@RequestParam Integer langCd){
        return repo.getPhysicalFeature(langCd);
    }

    @GetMapping("relationType")
    public List<DropdownResponse> getRelationType(@RequestParam Integer langCd){
        return repo.getRelationType(langCd);
    }

    @GetMapping("travelType")
    public List<DropdownResponse> getTravelType(@RequestParam Integer langCd){
        return repo.getTravelType(langCd);
    }

    @GetMapping("nationalityType")
    public List<DropdownResponse> getNationalityType(@RequestParam Integer langCd){
        return repo.getNationalityType(langCd);
    }

    @GetMapping("nationalityAcquiredBy")
    public List<DropdownResponse> getNationalityAcquiredBy(@RequestParam Integer langCd){
        return repo.getNationalityAcquiredBy(langCd);
    }



}
