package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Bool_Q$;
import CC.$.Q2$_LMNt.Q_Long$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Bool_Long$ extends Bool_Q$,Q_Long$
{
	Clas_Rap Class=Init_StRt_Nd(Bool_Long$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Bool_Long$(boolean A,long B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_Longg$(boolean[] Ag,long[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Bool_Long$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_Longg$(Iterable<Boolean> Ag,Iterable<Long> Bg)
		{
			Iterator<Boolean> A_Itr=Ag.iterator();
			Iterator<Long> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Bool_Long$(A_Itr.next(),B_Itr.next());}
		}
}