package com.example.college.dao;


import com.example.college.model.SatisfactionRating;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SatisfactionRatingDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;

    public void createSatisfactionRating(SatisfactionRating satisfactionRating) {
        String sql = """
                insert into SATISFACTION_RATING(
                name_of_the_structural_unit, is_employee_of_the_administration, academic_title, 
                trust_level_in_management, trust_level_in_you, degree_of_involvement, relationship_level, 
                recognition_of_your_successes_by_you, recognition_of_your_successes_by_management, 
                help_guide, level_of_regulation, equipment_conditions, safety_and_security, 
                educational_institution, satisfaction_with_technology, quality_satisfaction, 
                possibilities_org, possibilities_adm, salary, motivation_system, level_organization, 
                collective_agreement, labor_regulations, quality_management_system, influence_qms, 
                organization_and_rating, suggestions_for_improvements, specific_proposals, privileges, 
                interference, activity_interference, you_are_missing, training, date_of_passage) 
                values (
                 :name_of_structural_unit, :is_employee_of_the_administration, :academic_title,
                 :trust_level_in_management, :trust_level_in_you, :degree_of_involvement, :relationship_level,
                 :recognition_of_your_successes_by_you, :recognition_of_your_successes_by_management, 
                 :help_guide, :level_of_regulation, :equipment_conditions, :safety_and_security,
                 :educational_institution, :satisfaction_with_technology, :quality_satisfaction,
                 :possibilities_org, :possibilities_adm, :salary, :motivation_system, :level_organization,
                 :collective_agreement, :labor_regulations, :quality_management_system, :influence_qms,
                 :organization_and_rating, :suggestions_for_improvements, :specific_proposals, :privileges,
                 :interference, :activity_interference, :you_are_missing, :training, :date_of_passage
                 )
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("name_of_structural_unit", satisfactionRating.getNameOfTheStructuralUnit())
                .addValue("is_employee_of_the_administration", satisfactionRating.getIsEmployeeOfTheAdministration())
                .addValue("academic_title", satisfactionRating.getAcademicTitle())
                .addValue("trust_level_in_management", satisfactionRating.getTrustLevelInManagement())
                .addValue("trust_level_in_you", satisfactionRating.getTrustLevelInYou())
                .addValue("degree_of_involvement", satisfactionRating.getDegreeOfInvolvement())
                .addValue("relationship_level", satisfactionRating.getRelationshipLevel())
                .addValue("recognition_of_your_successes_by_you", satisfactionRating.getRecognitionOfYourSuccessesByYou())
                .addValue("help_guide", satisfactionRating.getHelpGuide())
                .addValue("level_of_regulation", satisfactionRating.getLevelOfRegulation())
                .addValue("equipment_conditions", satisfactionRating.getEquipmentConditions())
                .addValue("safety_and_security", satisfactionRating.getSafetyAndSecurity())
                .addValue("educational_institution", satisfactionRating.getEducationalInstitution())
                .addValue("satisfaction_with_technology", satisfactionRating.getSatisfactionWithTechnology())
                .addValue("quality_satisfaction", satisfactionRating.getQualitySatisfaction())
                .addValue("influence_qms", satisfactionRating.getInfluenceQMS())
                .addValue("organization_and_rating", satisfactionRating.getOrganizationAndRating())
                .addValue("suggestions_for_improvements", satisfactionRating.getSuggestionsForImprovements())
                .addValue("specific_proposals", satisfactionRating.getSpecificProposals())
                .addValue("privileges", satisfactionRating.getPrivileges())
                .addValue("interference", satisfactionRating.getInterference())
                .addValue("activity_interference", satisfactionRating.getActivityInterference())
                .addValue("you_are_missing", satisfactionRating.getYouAreMissing())
                .addValue("training", satisfactionRating.getTraining())
                .addValue("date_of_passage", satisfactionRating.getDateOfPassage()));
    }

    public Long countPassing() {
        String sql = """
                select max(id) from SATISFACTION_RATING
                """;

        return jdbcTemplate.queryForObject(sql, Long.class);
    }
}
