package com.sq.common_module.common.bean;

import java.util.List;

public class KeySearchBean {


    private int totalCount;
    private List<SitesDTO> sites;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<SitesDTO> getSites() {
        return sites;
    }

    public void setSites(List<SitesDTO> sites) {
        this.sites = sites;
    }

    public static class SitesDTO {
        private double distance;
        private PoiDTO poi;
        private String formatAddress;
        private AddressDTO address;
        private ViewportDTO viewport;
        private String name;
        private String siteId;
        private LocationDTO location;

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public PoiDTO getPoi() {
            return poi;
        }

        public void setPoi(PoiDTO poi) {
            this.poi = poi;
        }

        public String getFormatAddress() {
            return formatAddress;
        }

        public void setFormatAddress(String formatAddress) {
            this.formatAddress = formatAddress;
        }

        public AddressDTO getAddress() {
            return address;
        }

        public void setAddress(AddressDTO address) {
            this.address = address;
        }

        public ViewportDTO getViewport() {
            return viewport;
        }

        public void setViewport(ViewportDTO viewport) {
            this.viewport = viewport;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSiteId() {
            return siteId;
        }

        public void setSiteId(String siteId) {
            this.siteId = siteId;
        }

        public LocationDTO getLocation() {
            return location;
        }

        public void setLocation(LocationDTO location) {
            this.location = location;
        }

        public static class PoiDTO {
            private int rating;
            private String icon;
            private List<String> poiTypes;
            private List<String> hwPoiTypes;
            private String internationalPhone;

            public int getRating() {
                return rating;
            }

            public void setRating(int rating) {
                this.rating = rating;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public List<String> getPoiTypes() {
                return poiTypes;
            }

            public void setPoiTypes(List<String> poiTypes) {
                this.poiTypes = poiTypes;
            }

            public List<String> getHwPoiTypes() {
                return hwPoiTypes;
            }

            public void setHwPoiTypes(List<String> hwPoiTypes) {
                this.hwPoiTypes = hwPoiTypes;
            }

            public String getInternationalPhone() {
                return internationalPhone;
            }

            public void setInternationalPhone(String internationalPhone) {
                this.internationalPhone = internationalPhone;
            }
        }

        public static class AddressDTO {
            private String country;
            private String tertiaryAdminArea;
            private String subLocality;
            private String cityId;
            private String countryCode;
            private String adminArea;
            private String subAdminArea;

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getTertiaryAdminArea() {
                return tertiaryAdminArea;
            }

            public void setTertiaryAdminArea(String tertiaryAdminArea) {
                this.tertiaryAdminArea = tertiaryAdminArea;
            }

            public String getSubLocality() {
                return subLocality;
            }

            public void setSubLocality(String subLocality) {
                this.subLocality = subLocality;
            }

            public String getCityId() {
                return cityId;
            }

            public void setCityId(String cityId) {
                this.cityId = cityId;
            }

            public String getCountryCode() {
                return countryCode;
            }

            public void setCountryCode(String countryCode) {
                this.countryCode = countryCode;
            }

            public String getAdminArea() {
                return adminArea;
            }

            public void setAdminArea(String adminArea) {
                this.adminArea = adminArea;
            }

            public String getSubAdminArea() {
                return subAdminArea;
            }

            public void setSubAdminArea(String subAdminArea) {
                this.subAdminArea = subAdminArea;
            }
        }

        public static class ViewportDTO {
            private SouthwestDTO southwest;
            private NortheastDTO northeast;

            public SouthwestDTO getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestDTO southwest) {
                this.southwest = southwest;
            }

            public NortheastDTO getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastDTO northeast) {
                this.northeast = northeast;
            }

            public static class SouthwestDTO {
                private double lng;
                private double lat;

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }
            }

            public static class NortheastDTO {
                private double lng;
                private double lat;

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }
            }
        }

        public static class LocationDTO {
            private double lng;
            private double lat;

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }
        }
    }
}
