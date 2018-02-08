package br.gov.ma.seap.beans;

import br.gov.ma.seap.daos.LembreteDAO;
import br.gov.ma.seap.models.Lembrete;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class CadastraLembreteBean {

    private Lembrete lembrete = new Lembrete();

      public void salvar() {
        System.out.println("Lembrete salvo com sucesso: ");
        LembreteDAO dao = new LembreteDAO();
        dao.salvar(lembrete);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Lembrete Salvo com Sucesso!"));
        context.getExternalContext().getFlash().setKeepMessages(true);

    }

    public Lembrete getLembrete() {
        return lembrete;
    }
}
