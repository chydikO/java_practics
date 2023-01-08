package ua.step.example.part7.gof;

/**
 * 
 * Шаблон Memento
 *
 */
public class Task07 {
	public static void main(String[] args) {
		SiteDescrBean siteDescrBean = new SiteDescrBean("Main", 3);
		System.out.println(siteDescrBean);
		siteDescrBean.preview();
        siteDescrBean.setDescription("test");
        siteDescrBean.setCategory(1);
        System.out.println(siteDescrBean);
        siteDescrBean.undoChanges();
        System.out.println(siteDescrBean);
	}
}
class SiteDescrBean {
    private String description;
    private int category;

    private Memento undo;

    public SiteDescrBean(String description, int category) {
    	this.description = description;
    	this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public int getCategory() {
		return category;
	}

	private class Memento {
        String siteDescription;
        int siteCategory;

        Memento() {
            siteDescription = description;
            siteCategory = category;
        }

        String getDescr() {
            return siteDescription;
        }

        int getCateg() {
            return siteCategory;
        }
    }

    public void preview() {
        undo = new Memento();
    }

    public void setCategory(int category) {
		this.category = category;
		
	}

	public void setDescription(String description) {
		this.description = description;
		
	}

	public void undoChanges() {
        description = undo.getDescr();
        category = undo.getCateg();
    }

	@Override
	public String toString() {
		return "SiteDescrBean [description=" + description + ", category="
				+ category + "]";
	}
}