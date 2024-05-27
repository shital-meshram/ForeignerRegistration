package com.master.dropdown.MasterDropdown.Repository;

import com.master.dropdown.MasterDropdown.Dto.DropdownResponse;
import com.master.dropdown.MasterDropdown.Dto.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonRepository extends JpaRepository<DummyEntity, Long> {

    @Query("SELECT new com.master.dropdown.MasterDropdown.Dto.DropdownResponse(id.genderCd, gender) from MGender WHERE id.langCd=:langCd AND id.genderCd<>0 AND recordStatus <> 'D'  ORDER BY gender")
    List<DropdownResponse> getGenderList(Integer langCd);


    @Query("SELECT new com.master.dropdown.MasterDropdown.Dto.DropdownResponse(id.eduQualCd, eduQual) from MEducationalQualification WHERE id.langCd=:langCd AND id.eduQualCd<>0 AND recordStatus <> 'D'")
    List<DropdownResponse> getEducationQualificationList(Integer langCd);

    @Query("SELECT new com.master.dropdown.MasterDropdown.Dto.DropdownResponse(id.maritalStatusCd, maritalStatus) from MMaritalStatus WHERE id.langCd=:langCd AND maritalStatus<>'' AND id.maritalStatusCd<>0 AND recordStatus <> 'D' ORDER BY maritalStatus")
    List<DropdownResponse> getMaritalStatus(Integer langCd);


    @Query("SELECT new com.master.dropdown.MasterDropdown.Dto.DropdownResponse(id.physicalFeatureCd, physicalFeature) from MPhysicalFeature WHERE id.langCd=:langCd AND id.physicalFeatureCd<>0 AND recordStatus <> 'D' ORDER BY physicalFeature")
    List<DropdownResponse> getPhysicalFeature(Integer langCd);

    @Query("SELECT new com.master.dropdown.MasterDropdown.Dto.DropdownResponse(id.relationTypeCd, relationType) from MRelationType WHERE id.langCd=:langCd AND id.relationTypeCd<>0 AND recordStatus <> 'D' ORDER BY relationType")
    List<DropdownResponse> getRelationType(Integer langCd);

    @Query("SELECT new com.master.dropdown.MasterDropdown.Dto.DropdownResponse(id.trvlelTypeCd, trvlelType) from MTravelType WHERE id.langCd=:langCd AND id.trvlelTypeCd<>0 AND recordStatus <> 'D' ORDER BY trvlelType")
    List<DropdownResponse> getTravelType(Integer langCd);
    @Query("SELECT new com.master.dropdown.MasterDropdown.Dto.DropdownResponse(id.nationalityCd, nationality) from MNationality WHERE id.langCd=:langCd AND id.nationalityCd<>0 AND recordStatus <> 'D' ORDER BY nationality")
    List<DropdownResponse> getNationalityType(Integer langCd);

    @Query("SELECT new com.master.dropdown.MasterDropdown.Dto.DropdownResponse(id.nationAqurByCd, nationAqurBy) from MNationalityAcquireBy WHERE id.langCd=:langCd AND id.nationAqurByCd<>0 AND recordStatus <> 'D' ORDER BY nationAqurBy")
    List<DropdownResponse> getNationalityAcquiredBy(Integer langCd);
}
