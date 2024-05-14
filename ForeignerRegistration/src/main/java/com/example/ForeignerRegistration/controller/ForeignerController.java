package com.example.ForeignerRegistration.controller;

import com.example.ForeignerRegistration.model.TCsForeignerRegistration;
import com.example.ForeignerRegistration.model.TCsForeignerRegistrationPK;
import com.example.ForeignerRegistration.service.ForeignerService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foreigner")
public class ForeignerController {

    @Autowired
    private ForeignerService foreignerService;

    @GetMapping("getAll")
    public List<TCsForeignerRegistration> getAllForeigners() {
        return foreignerService.getAllForeigners();
    }

    @GetMapping("getById/{id}")
    public TCsForeignerRegistration getForeignerById(@PathVariable TCsForeignerRegistrationPK id) {
        return foreignerService.getForeignerById(id);
    }

    @PostMapping("insert")
    public TCsForeignerRegistration createForeigner(@RequestBody TCsForeignerRegistration foreigner) {
        return foreignerService.createForeigner(foreigner);
    }

    @PutMapping("update/{id}")
    public TCsForeignerRegistration updateForeigner(@PathVariable TCsForeignerRegistrationPK id, @RequestBody TCsForeignerRegistration foreigner) {
        return foreignerService.updateForeigner(id, foreigner);
    }

    @DeleteMapping("delete/{id}")
    public void deleteForeigner(@PathVariable TCsForeignerRegistrationPK id) {
        foreignerService.deleteForeigner(id);
    }

    //Implement Pagination and sorting
    @GetMapping("get-records-pagination/{pageNum}/{pageSize}")
    public Page<TCsForeignerRegistration> getForeignerResultsByPaginationAndSorting(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        return foreignerService.getForeignerResultsByPaginationAndSorting(pageNum, pageSize, null);
    }

    @GetMapping("get-records-pagination/{pageNum}/{pageSize}/{sortProperty}")
    public Page<TCsForeignerRegistration> getForeignerResultsByPaginationAndSorting(@PathVariable Integer pageNum, @PathVariable Integer pageSize,
                                                                                    @PathVariable String sortProperty) {
        return foreignerService.getForeignerResultsByPaginationAndSorting(pageNum, pageSize, sortProperty);
    }
}
