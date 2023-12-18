package dev.danvega.serverlessapi.rest;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "leads")
public class Leads {
	
	 public static class Id {
	        private String oid;

			public String getOid() {
				return oid;
			}

			public void setOid(String oid) {
				this.oid = oid;
			}
	        
	        // getters and setters
	    }

	    public static class Email {
	        private String address;
	        private String type;
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}

	        
	    }

	    public static class Title {
	        private String name;
	        private String role;
	        private String subRole;
	        private List<String> levels;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getRole() {
				return role;
			}
			public void setRole(String role) {
				this.role = role;
			}
			public String getSubRole() {
				return subRole;
			}
			public void setSubRole(String subRole) {
				this.subRole = subRole;
			}
			public List<String> getLevels() {
				return levels;
			}
			public void setLevels(List<String> levels) {
				this.levels = levels;
			}

	        
	    }

	    public static class Company {
	        private String name;
	        private String size;
	        private String id;
	        private String founded;
	        private String industry;
	        private String location;
	        private String linkedinUrl;
	        private String linkedinId;
	        private String facebookUrl;
	        private String twitterUrl;
	        private String website;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getSize() {
				return size;
			}
			public void setSize(String size) {
				this.size = size;
			}
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public String getFounded() {
				return founded;
			}
			public void setFounded(String founded) {
				this.founded = founded;
			}
			public String getIndustry() {
				return industry;
			}
			public void setIndustry(String industry) {
				this.industry = industry;
			}
			public String getLocation() {
				return location;
			}
			public void setLocation(String location) {
				this.location = location;
			}
			public String getLinkedinUrl() {
				return linkedinUrl;
			}
			public void setLinkedinUrl(String linkedinUrl) {
				this.linkedinUrl = linkedinUrl;
			}
			public String getLinkedinId() {
				return linkedinId;
			}
			public void setLinkedinId(String linkedinId) {
				this.linkedinId = linkedinId;
			}
			public String getFacebookUrl() {
				return facebookUrl;
			}
			public void setFacebookUrl(String facebookUrl) {
				this.facebookUrl = facebookUrl;
			}
			public String getTwitterUrl() {
				return twitterUrl;
			}
			public void setTwitterUrl(String twitterUrl) {
				this.twitterUrl = twitterUrl;
			}
			public String getWebsite() {
				return website;
			}
			public void setWebsite(String website) {
				this.website = website;
			}

	        // getters and setters
	    }

	    public static class Experience {
	        private Company company;
	        private List<String> locationNames;
	        private String endDate;
	        private String startDate;
	        private Title title;
	        private boolean isPrimary;
	        private String summary;
			public Company getCompany() {
				return company;
			}
			public void setCompany(Company company) {
				this.company = company;
			}
			public List<String> getLocationNames() {
				return locationNames;
			}
			public void setLocationNames(List<String> locationNames) {
				this.locationNames = locationNames;
			}
			public String getEndDate() {
				return endDate;
			}
			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}
			public String getStartDate() {
				return startDate;
			}
			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}
			public Title getTitle() {
				return title;
			}
			public void setTitle(Title title) {
				this.title = title;
			}
			public boolean isPrimary() {
				return isPrimary;
			}
			public void setPrimary(boolean isPrimary) {
				this.isPrimary = isPrimary;
			}
			public String getSummary() {
				return summary;
			}
			public void setSummary(String summary) {
				this.summary = summary;
			}

	        // getters and setters
	    }

	    public static class Education {
	        private String school;
	        private String endDate;
	        private String startDate;
	        private String gpa;
	        private List<String> degrees;
	        private List<String> majors;
	        private List<String> minors;
	        private String summary;
			public String getSchool() {
				return school;
			}
			public void setSchool(String school) {
				this.school = school;
			}
			public String getEndDate() {
				return endDate;
			}
			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}
			public String getStartDate() {
				return startDate;
			}
			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}
			public String getGpa() {
				return gpa;
			}
			public void setGpa(String gpa) {
				this.gpa = gpa;
			}
			public List<String> getDegrees() {
				return degrees;
			}
			public void setDegrees(List<String> degrees) {
				this.degrees = degrees;
			}
			public List<String> getMajors() {
				return majors;
			}
			public void setMajors(List<String> majors) {
				this.majors = majors;
			}
			public List<String> getMinors() {
				return minors;
			}
			public void setMinors(List<String> minors) {
				this.minors = minors;
			}
			public String getSummary() {
				return summary;
			}
			public void setSummary(String summary) {
				this.summary = summary;
			}

	       
	    }

	    public static class Profile {
	        private String network;
	        private String id;
	        private String url;
	        private String username;
			public String getNetwork() {
				return network;
			}
			public void setNetwork(String network) {
				this.network = network;
			}
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public String getUrl() {
				return url;
			}
			public void setUrl(String url) {
				this.url = url;
			}
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}

	       
	    }

	    public static class VersionStatus {
	        private String status;
	        private List<String> contains;
	        private String previousVersion;
	        private String currentVersion;
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			public List<String> getContains() {
				return contains;
			}
			public void setContains(List<String> contains) {
				this.contains = contains;
			}
			public String getPreviousVersion() {
				return previousVersion;
			}
			public void setPreviousVersion(String previousVersion) {
				this.previousVersion = previousVersion;
			}
			public String getCurrentVersion() {
				return currentVersion;
			}
			public void setCurrentVersion(String currentVersion) {
				this.currentVersion = currentVersion;
			}

	        
	    }
	
	@org.springframework.data.annotation.Id
	private Id _id;
    private String id;
    private String fullName;
    private String firstName;
    private String middleInitial;
    private String middleName;
    private String lastName;
    private String gender;
    private String birthYear;
    private String birthDate;
    private String linkedinUrl;
    private String linkedinUsername;
    private String linkedinId;
    private String facebookUrl;
    private String facebookUsername;
    private String facebookId;
    private String twitterUrl;
    private String twitterUsername;
    private String githubUrl;
    private String githubUsername;
    private String workEmail;
    private String mobilePhone;
    private String industry;
    private String jobTitle;
    private String jobTitleRole;
    private String jobTitleSubRole;
    private List<String> jobTitleLevels;
    private String jobCompanyId;
    private String jobCompanyName;
    private String jobCompanyWebsite;
    private String jobCompanySize;
    private String jobCompanyFounded;
    private String jobCompanyIndustry;
    private String jobCompanyLinkedinUrl;
    private String jobCompanyLinkedinId;
    private String jobCompanyFacebookUrl;
    private String jobCompanyTwitterUrl;
    private String jobCompanyLocationName;
    private String jobCompanyLocationLocality;
    private String jobCompanyLocationMetro;
    private String jobCompanyLocationRegion;
    private String jobCompanyLocationGeo;
    private String jobCompanyLocationStreetAddress;
    private String jobCompanyLocationAddressLine2;
    private String jobCompanyLocationPostalCode;
    private String jobCompanyLocationCountry;
    private String jobCompanyLocationContinent;
    private String jobLastUpdated;
    private String jobStartDate;
    private String jobSummary;
    private String locationName;
    private String locationLocality;
    private String locationMetro;
    private String locationRegion;
    private String locationCountry;
    private String locationContinent;
    private String locationStreetAddress;
    private String locationAddressLine2;
    private String locationPostalCode;
    private String locationGeo;
    private String locationLastUpdated;
    private int linkedinConnections;
    private String inferredSalary;
    private int inferredYearsExperience;
    private String summary;
    private List<Email> emails;
    private List<String> interests;
    private List<String> skills;
    private List<String> locationNames;
    private List<String> regions;
    private List<String> countries;
    private List<String> streetAddresses;
    private List<Experience> experience;
    private List<Education> education;
    private List<Profile> profiles;
    private List<String> certifications;
    private List<String> languages;
    private VersionStatus versionStatus;
	public Id get_id() {
		return _id;
	}
	public void set_id(Id _id) {
		this._id = _id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public String getLinkedinUsername() {
		return linkedinUsername;
	}
	public void setLinkedinUsername(String linkedinUsername) {
		this.linkedinUsername = linkedinUsername;
	}
	public String getLinkedinId() {
		return linkedinId;
	}
	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}
	public String getFacebookUrl() {
		return facebookUrl;
	}
	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}
	public String getFacebookUsername() {
		return facebookUsername;
	}
	public void setFacebookUsername(String facebookUsername) {
		this.facebookUsername = facebookUsername;
	}
	public String getFacebookId() {
		return facebookId;
	}
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}
	public String getTwitterUrl() {
		return twitterUrl;
	}
	public void setTwitterUrl(String twitterUrl) {
		this.twitterUrl = twitterUrl;
	}
	public String getTwitterUsername() {
		return twitterUsername;
	}
	public void setTwitterUsername(String twitterUsername) {
		this.twitterUsername = twitterUsername;
	}
	public String getGithubUrl() {
		return githubUrl;
	}
	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}
	public String getGithubUsername() {
		return githubUsername;
	}
	public void setGithubUsername(String githubUsername) {
		this.githubUsername = githubUsername;
	}
	public String getWorkEmail() {
		return workEmail;
	}
	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobTitleRole() {
		return jobTitleRole;
	}
	public void setJobTitleRole(String jobTitleRole) {
		this.jobTitleRole = jobTitleRole;
	}
	public String getJobTitleSubRole() {
		return jobTitleSubRole;
	}
	public void setJobTitleSubRole(String jobTitleSubRole) {
		this.jobTitleSubRole = jobTitleSubRole;
	}
	public List<String> getJobTitleLevels() {
		return jobTitleLevels;
	}
	public void setJobTitleLevels(List<String> jobTitleLevels) {
		this.jobTitleLevels = jobTitleLevels;
	}
	public String getJobCompanyId() {
		return jobCompanyId;
	}
	public void setJobCompanyId(String jobCompanyId) {
		this.jobCompanyId = jobCompanyId;
	}
	public String getJobCompanyName() {
		return jobCompanyName;
	}
	public void setJobCompanyName(String jobCompanyName) {
		this.jobCompanyName = jobCompanyName;
	}
	public String getJobCompanyWebsite() {
		return jobCompanyWebsite;
	}
	public void setJobCompanyWebsite(String jobCompanyWebsite) {
		this.jobCompanyWebsite = jobCompanyWebsite;
	}
	public String getJobCompanySize() {
		return jobCompanySize;
	}
	public void setJobCompanySize(String jobCompanySize) {
		this.jobCompanySize = jobCompanySize;
	}
	public String getJobCompanyFounded() {
		return jobCompanyFounded;
	}
	public void setJobCompanyFounded(String jobCompanyFounded) {
		this.jobCompanyFounded = jobCompanyFounded;
	}
	public String getJobCompanyIndustry() {
		return jobCompanyIndustry;
	}
	public void setJobCompanyIndustry(String jobCompanyIndustry) {
		this.jobCompanyIndustry = jobCompanyIndustry;
	}
	public String getJobCompanyLinkedinUrl() {
		return jobCompanyLinkedinUrl;
	}
	public void setJobCompanyLinkedinUrl(String jobCompanyLinkedinUrl) {
		this.jobCompanyLinkedinUrl = jobCompanyLinkedinUrl;
	}
	public String getJobCompanyLinkedinId() {
		return jobCompanyLinkedinId;
	}
	public void setJobCompanyLinkedinId(String jobCompanyLinkedinId) {
		this.jobCompanyLinkedinId = jobCompanyLinkedinId;
	}
	public String getJobCompanyFacebookUrl() {
		return jobCompanyFacebookUrl;
	}
	public void setJobCompanyFacebookUrl(String jobCompanyFacebookUrl) {
		this.jobCompanyFacebookUrl = jobCompanyFacebookUrl;
	}
	public String getJobCompanyTwitterUrl() {
		return jobCompanyTwitterUrl;
	}
	public void setJobCompanyTwitterUrl(String jobCompanyTwitterUrl) {
		this.jobCompanyTwitterUrl = jobCompanyTwitterUrl;
	}
	public String getJobCompanyLocationName() {
		return jobCompanyLocationName;
	}
	public void setJobCompanyLocationName(String jobCompanyLocationName) {
		this.jobCompanyLocationName = jobCompanyLocationName;
	}
	public String getJobCompanyLocationLocality() {
		return jobCompanyLocationLocality;
	}
	public void setJobCompanyLocationLocality(String jobCompanyLocationLocality) {
		this.jobCompanyLocationLocality = jobCompanyLocationLocality;
	}
	public String getJobCompanyLocationMetro() {
		return jobCompanyLocationMetro;
	}
	public void setJobCompanyLocationMetro(String jobCompanyLocationMetro) {
		this.jobCompanyLocationMetro = jobCompanyLocationMetro;
	}
	public String getJobCompanyLocationRegion() {
		return jobCompanyLocationRegion;
	}
	public void setJobCompanyLocationRegion(String jobCompanyLocationRegion) {
		this.jobCompanyLocationRegion = jobCompanyLocationRegion;
	}
	public String getJobCompanyLocationGeo() {
		return jobCompanyLocationGeo;
	}
	public void setJobCompanyLocationGeo(String jobCompanyLocationGeo) {
		this.jobCompanyLocationGeo = jobCompanyLocationGeo;
	}
	public String getJobCompanyLocationStreetAddress() {
		return jobCompanyLocationStreetAddress;
	}
	public void setJobCompanyLocationStreetAddress(String jobCompanyLocationStreetAddress) {
		this.jobCompanyLocationStreetAddress = jobCompanyLocationStreetAddress;
	}
	public String getJobCompanyLocationAddressLine2() {
		return jobCompanyLocationAddressLine2;
	}
	public void setJobCompanyLocationAddressLine2(String jobCompanyLocationAddressLine2) {
		this.jobCompanyLocationAddressLine2 = jobCompanyLocationAddressLine2;
	}
	public String getJobCompanyLocationPostalCode() {
		return jobCompanyLocationPostalCode;
	}
	public void setJobCompanyLocationPostalCode(String jobCompanyLocationPostalCode) {
		this.jobCompanyLocationPostalCode = jobCompanyLocationPostalCode;
	}
	public String getJobCompanyLocationCountry() {
		return jobCompanyLocationCountry;
	}
	public void setJobCompanyLocationCountry(String jobCompanyLocationCountry) {
		this.jobCompanyLocationCountry = jobCompanyLocationCountry;
	}
	public String getJobCompanyLocationContinent() {
		return jobCompanyLocationContinent;
	}
	public void setJobCompanyLocationContinent(String jobCompanyLocationContinent) {
		this.jobCompanyLocationContinent = jobCompanyLocationContinent;
	}
	public String getJobLastUpdated() {
		return jobLastUpdated;
	}
	public void setJobLastUpdated(String jobLastUpdated) {
		this.jobLastUpdated = jobLastUpdated;
	}
	public String getJobStartDate() {
		return jobStartDate;
	}
	public void setJobStartDate(String jobStartDate) {
		this.jobStartDate = jobStartDate;
	}
	public String getJobSummary() {
		return jobSummary;
	}
	public void setJobSummary(String jobSummary) {
		this.jobSummary = jobSummary;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationLocality() {
		return locationLocality;
	}
	public void setLocationLocality(String locationLocality) {
		this.locationLocality = locationLocality;
	}
	public String getLocationMetro() {
		return locationMetro;
	}
	public void setLocationMetro(String locationMetro) {
		this.locationMetro = locationMetro;
	}
	public String getLocationRegion() {
		return locationRegion;
	}
	public void setLocationRegion(String locationRegion) {
		this.locationRegion = locationRegion;
	}
	public String getLocationCountry() {
		return locationCountry;
	}
	public void setLocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}
	public String getLocationContinent() {
		return locationContinent;
	}
	public void setLocationContinent(String locationContinent) {
		this.locationContinent = locationContinent;
	}
	public String getLocationStreetAddress() {
		return locationStreetAddress;
	}
	public void setLocationStreetAddress(String locationStreetAddress) {
		this.locationStreetAddress = locationStreetAddress;
	}
	public String getLocationAddressLine2() {
		return locationAddressLine2;
	}
	public void setLocationAddressLine2(String locationAddressLine2) {
		this.locationAddressLine2 = locationAddressLine2;
	}
	public String getLocationPostalCode() {
		return locationPostalCode;
	}
	public void setLocationPostalCode(String locationPostalCode) {
		this.locationPostalCode = locationPostalCode;
	}
	public String getLocationGeo() {
		return locationGeo;
	}
	public void setLocationGeo(String locationGeo) {
		this.locationGeo = locationGeo;
	}
	public String getLocationLastUpdated() {
		return locationLastUpdated;
	}
	public void setLocationLastUpdated(String locationLastUpdated) {
		this.locationLastUpdated = locationLastUpdated;
	}
	public int getLinkedinConnections() {
		return linkedinConnections;
	}
	public void setLinkedinConnections(int linkedinConnections) {
		this.linkedinConnections = linkedinConnections;
	}
	public String getInferredSalary() {
		return inferredSalary;
	}
	public void setInferredSalary(String inferredSalary) {
		this.inferredSalary = inferredSalary;
	}
	public int getInferredYearsExperience() {
		return inferredYearsExperience;
	}
	public void setInferredYearsExperience(int inferredYearsExperience) {
		this.inferredYearsExperience = inferredYearsExperience;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	public List<String> getInterests() {
		return interests;
	}
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public List<String> getLocationNames() {
		return locationNames;
	}
	public void setLocationNames(List<String> locationNames) {
		this.locationNames = locationNames;
	}
	public List<String> getRegions() {
		return regions;
	}
	public void setRegions(List<String> regions) {
		this.regions = regions;
	}
	public List<String> getCountries() {
		return countries;
	}
	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	public List<String> getStreetAddresses() {
		return streetAddresses;
	}
	public void setStreetAddresses(List<String> streetAddresses) {
		this.streetAddresses = streetAddresses;
	}
	public List<Experience> getExperience() {
		return experience;
	}
	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}
	public List<Education> getEducation() {
		return education;
	}
	public void setEducation(List<Education> education) {
		this.education = education;
	}
	public List<Profile> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}
	public List<String> getCertifications() {
		return certifications;
	}
	public void setCertifications(List<String> certifications) {
		this.certifications = certifications;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public VersionStatus getVersionStatus() {
		return versionStatus;
	}
	public void setVersionStatus(VersionStatus versionStatus) {
		this.versionStatus = versionStatus;
	}
    
   
}
