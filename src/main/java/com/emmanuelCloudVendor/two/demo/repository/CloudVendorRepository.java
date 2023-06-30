package com.emmanuelCloudVendor.two.demo.repository;

import com.emmanuelCloudVendor.two.demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

    List<CloudVendor> findByVendorName(String vendorName);
}
