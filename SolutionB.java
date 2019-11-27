import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class SiteStats {
    private String url;
    private int numVisits;

    /**
     * Constructor for the SiteStats class
     * 
     * @param url       String that represents an URL that the user has visited
     * @param numVisits An int that represents the number of times that the user has
     *                  visited the url
     */
    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }

    /**
     * This method returns the number of times that the user has visited the url.
     * 
     * @return An int that represents the number of times that the user has visited
     *         the url
     */
    public int getNumVisits() {
        return this.numVisits;
    }

    /**
     * This method returns the url that we are currently tracking
     * 
     * @return A String that represents the url that we are currently tracking
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * This method updates the number of times that we have visited the url
     * 
     * @param an int that represents the number that we want to set numVisits to
     */
    public void setNumVisits(int updatedNumVisits) {
        this.numVisits = updatedNumVisits;
    }

    public String toString() {
        return this.url + " | " + this.numVisits;
    }

}

public class PartBSolution {

    private static Queue < SiteStats > sites = new LinkedList < SiteStats > ();

    public static int minIndex(int sortIndex) {
        int min_index = -1;
        SiteStats min_value = sites.peek();
        int s = sites.size();
        for (int i = 0; i < s; i++) {
            SiteStats current = sites.peek();

            sites.poll();


            if (current.getNumVisits() <= min_value.getNumVisits() && i <= sortIndex) {
                min_index = i;
                min_value = current;
            }
            sites.add(current);
        }
        return min_index;
    }


    public static void insertMinToRear(int min_index) {
        SiteStats min_value = sites.peek();
        int s = sites.size();
        for (int i = 0; i < s; i++) {
            SiteStats current = sites.peek();
            sites.poll();
            if (i != min_index)
                sites.add(current);
            else
                min_value = current;
        }
        sites.add(min_value);
    }


    public static void listTopVisitedSites(int n) {

        for (int i = 1; i <= sites.size(); i++) {
            int min_index = minIndex(sites.size() - i);
            insertMinToRear(min_index);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(sites.remove().getUrl());
        }


    }

    public static void updateCount(String url) {
        // WRITE CODE HERE
        int found = 0;
        int n = sites.size();

        for (int i = 0; i < n; i++) {

            SiteStats s = sites.remove();
            if (s.getUrl() == url) {
                found = 1;
                s.setNumVisits(s.getNumVisits() + 1);
                sites.add(s);
                break;
            }
            sites.add(s);
        }

        if (found == 0) {
            SiteStats s1 = new SiteStats(url, 1);
            sites.add(s1);
        }
    }

    public static void main(String[] args) {
        String[] visitedSites = {
            "www.google.co.in",
            "www.google.co.in",
            "www.facebook.com",
            "www.upgrad.com",
            "www.google.co.in",
            "www.youtube.com",
            "www.facebook.com",
            "www.upgrad.com",
            "www.facebook.com",
            "www.google.co.in",
            "www.microsoft.com",
            "www.9gag.com",
            "www.netflix.com",
            "www.netflix.com",
            "www.9gag.com",
            "www.microsoft.com",
            "www.amazon.com",
            "www.amazon.com",
            "www.uber.com",
            "www.amazon.com",
            "www.microsoft.com",
            "www.upgrad.com"
        };

        for (String url: visitedSites) {
            updateCount(url);
        }
        listTopVisitedSites(5);

    }

}