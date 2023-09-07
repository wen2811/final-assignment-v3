package com.wendy.backend.repositories;

import com.wendy.backend.models.Treatment;
import org.springframework.data.repository.CrudRepository;

public interface TreatmentRepository extends CrudRepository<Treatment, Long> {
}
