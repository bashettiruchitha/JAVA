public class MagazineShelf {
    int maganzineno;
    String maganzinename;
    String maganzineauthor;
    int noofpages;
    double magazineprice;
    
    public MagazineShelf(String maganzineauthor) {
        this.maganzineauthor = maganzineauthor;
    }

    public MagazineShelf(int maganzineno, String maganzinename, String maganzineauthor, int noofpages,
            double magazineprice) {
        this.maganzineno = maganzineno;
        this.maganzinename = maganzinename;
        this.maganzineauthor = maganzineauthor;
        this.noofpages = noofpages;
        this.magazineprice = magazineprice;
    }
  
    public int getMaganzineno() {
        return maganzineno;
    }
    public void setMaganzineno(int maganzineno) {
        this.maganzineno = maganzineno;
    }
    public String getMaganzinename() {
        return maganzinename;
    }
    public void setMaganzinename(String maganzinename) {
        this.maganzinename = maganzinename;
    }
    public String getMaganzineauthor() {
        return maganzineauthor;
    }
    public void setMaganzineauthor(String maganzineauthor) {
        this.maganzineauthor = maganzineauthor;
    }
    public int getNoofpages() {
        return noofpages;
    }
    public void setNoofpages(int noofpages) {
        this.noofpages = noofpages;
    }
    public double getMagazineprice() {
        return magazineprice;
    }
    public void setMagazineprice(double magazineprice) {
        this.magazineprice = magazineprice;
    }
    @Override
    public String toString() {
        return "MagazineShelf [maganzineno=" + maganzineno + ", maganzinename=" + maganzinename + ", maganzineauthor="
                + maganzineauthor + ", noofpages=" + noofpages + ", magazineprice=" + magazineprice + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + maganzineno;
        result = prime * result + ((maganzinename == null) ? 0 : maganzinename.hashCode());
        result = prime * result + ((maganzineauthor == null) ? 0 : maganzineauthor.hashCode());
        result = prime * result + noofpages;
        long temp;
        temp = Double.doubleToLongBits(magazineprice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MagazineShelf other = (MagazineShelf) obj;
        if (maganzineno != other.maganzineno)
            return false;
        if (maganzinename == null) {
            if (other.maganzinename != null)
                return false;
        } else if (!maganzinename.equals(other.maganzinename))
            return false;
        if (maganzineauthor == null) {
            if (other.maganzineauthor != null)
                return false;
        } else if (!maganzineauthor.equals(other.maganzineauthor))
            return false;
        if (noofpages != other.noofpages)
            return false;
        if (Double.doubleToLongBits(magazineprice) != Double.doubleToLongBits(other.magazineprice))
            return false;
        return true;
    }

}

    

