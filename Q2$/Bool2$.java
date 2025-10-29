package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q2$_LMNt.Bool_Q$;
import CC.$.Q2$_LMNt.Q_Bool$;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import java.util.Iterator;

public interface Bool2$ extends Bool_Q$,Q_Bool$
{
	Clas_Rap Class=Init_StRt_Nd(Bool2$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	void Bool_Bool$(boolean A,boolean B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_Boolg$(boolean[] Ag,boolean[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Bool_Bool$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_Boolg$(Iterable<Boolean> Ag,Iterable<Boolean> Bg)
		{
			Iterator<Boolean> A_Itr=Ag.iterator();
			Iterator<Boolean> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Bool_Bool$(A_Itr.next(),B_Itr.next());}
		}
}