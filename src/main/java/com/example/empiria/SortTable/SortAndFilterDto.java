package com.example.empiria.SortTable;

public class SortAndFilterDto {
   private int caseOfSorting;
  private   String searchForName;
   private String searchForLastName;
  private   String searchForIdNumber;
  private   String searchForPhoneNumber;
  private   String searchForAddres;

    public int getCaseOfSorting() {
        return caseOfSorting;
    }

    public void setCaseOfSorting(int caseOfSorting) {
        this.caseOfSorting = caseOfSorting;
    }

    public String getSearchForName() {
        return searchForName;
    }

    public void setSearchForName(String searchForName) {
        this.searchForName = searchForName;
    }

    public String getSearchForLastName() {
        return searchForLastName;
    }

    public void setSearchForLastName(String searchForLastName) {
        this.searchForLastName = searchForLastName;
    }

    public String getSearchForIdNumber() {
        return searchForIdNumber;
    }

    public void setSearchForIdNumber(String searchForIdNumber) {
        this.searchForIdNumber = searchForIdNumber;
    }

    public String getSearchForPhoneNumber() {
        return searchForPhoneNumber;
    }

    public void setSearchForPhoneNumber(String searchForPhoneNumber) {
        this.searchForPhoneNumber = searchForPhoneNumber;
    }

    public String getSearchForAddres() {
        return searchForAddres;
    }

    public void setSearchForAddres(String searchForAddres) {
        this.searchForAddres = searchForAddres;
    }
}
