package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.stereotype.Repository;

@Repository

public interface JobRepository extends CrudRepository<Job, Integer> {
}
