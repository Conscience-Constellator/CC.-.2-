package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Bool_Q$;
import CC.$.Q2$_LMNt.Q_Flot$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Bool_Flot$ extends Bool_Q$,Q_Flot$
{
	Clas_Rap Class=Init_StRt_Nd(Bool_Flot$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Bool_Flot$(boolean A,float B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_Flotg$(boolean[] Ag,float[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Bool_Flot$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_Flotg$(Iterable<Boolean> Ag,Iterable<Float> Bg)
		{
			Iterator<Boolean> A_Itr=Ag.iterator();
			Iterator<Float> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Bool_Flot$(A_Itr.next(),B_Itr.next());}
		}
}