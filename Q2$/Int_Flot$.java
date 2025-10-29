package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Int_Q$;
import CC.$.Q2$_LMNt.Q_Flot$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Int_Flot$ extends
		Int_Q$,
		Q_Flot$
{
	Clas_Rap Class=Init_StRt_Nd(Int_Flot$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Int_Flot$(int A,float B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_Flotg$(int[] Ag,float[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Int_Flot$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_Flotg$(Iterable<Integer> Ag,Iterable<Float> Bg)
		{
			Iterator<Integer> A_Itr=Ag.iterator();
			Iterator<Float> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Int_Flot$(A_Itr.next(),B_Itr.next());}
		}
}