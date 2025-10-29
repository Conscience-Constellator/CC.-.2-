package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Bool_Q$;
import CC.$.Q2$_LMNt.Q_Point$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import static java.lang.reflect.Array.newInstance;

public interface Bool_Point$<B_Typ> extends Bool_Q$,Q_Point$<B_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Bool_Point$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Bool_Point$(boolean A,B_Typ B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_Pointg$(boolean[] Ag,B_Typ[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Bool_Point$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_Pointg$(Iterable<Boolean> Ag,Iterable<B_Typ> Bg)
		{
			Iterator<Boolean> A_Itr=Ag.iterator();
			Iterator<B_Typ> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Bool_Point$(A_Itr.next(),B_Itr.next());}
		}
}